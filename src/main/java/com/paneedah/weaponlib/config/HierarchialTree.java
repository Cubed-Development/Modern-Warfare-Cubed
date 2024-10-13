package com.paneedah.weaponlib.config;

import lombok.Getter;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

/**
 * Tree with infinite breadth at the top, accessible using pathways
 * "pathA.pathB.pathC".
 *
 * @param <K> Generic type of Node objects
 *
 * @author Jim Holden
 */
public class HierarchialTree<K> {

    /**
     * Branch class, stores parent (null if at top), subbranches,
     * and various nodes
     *
     * @param <K> Generic type of Node object
     *
     * @author Jim Holden
     */
    public static class Branch<K> {

        @Getter
        private final Branch<K> parent;

        /**
         * -- GETTER --
         *  Name of this branch
         *
         * @return name of this branch
         */
        @Getter
        private final String key;

        /**
         * Map of all the subbranches
         */
        @Getter
        private final HashMap<String, Branch<K>> subBranches = new HashMap<>();

        /**
         * List of all the subbranches
         */
        private final List<Branch<K>> subBranchList = new ArrayList<>();

        @Getter
        private final List<K> nodes = new ArrayList<>();

        public Branch(String key, Branch<K> parent) {
            this.key = key;
            this.parent = parent;
        }

        public boolean isRoot() {
            return parent == null;
        }

        /**
         * Returns amount of sub-branches on this tree
         *
         * @return total amount of sub-branches on this branch
         */
        public int size() {
            return subBranches.size();
        }


        /**
         * Returns amount of nodes on this tree
         *
         * @return total amount of nodes on this branch
         */
        public int nodeCount() {
            return nodes.size();
        }

        private Branch<K> putBranch(String key, Branch<K> newBranch) {
            subBranchList.add(newBranch);
            subBranches.put(key, newBranch);
            return newBranch;
        }

        public Iterator<K> getNodeIterator() {
            return nodes.iterator();
        }

        /**
         * Recursive tree walk that prints sub-branches
         *
         * @param i - Order of shrouding (how many branches it takes to get here)
         */
        public void print(int i) {
            for (Entry<String, Branch<K>> branch : subBranches.entrySet()) {
                for (int n = 0; n < i; n++)
                    System.out.print("-");
                String print = " " + branch.getKey();
                if (branch.getValue().size() != 0) {
                    print += " (" + branch.getValue().size() + ")";
                }
                System.out.println(print);
                branch.getValue().print(i + 1);
            }
        }

        /**
         * Returns the total branches of all sub-branches beneath this.
         *
         * @return total branches beneath
         */
        public int totalBranchesBeneath() {
            int total = 0;
            for (Entry<String, Branch<K>> branch : subBranches.entrySet()) {
                total += branch.getValue().totalBranchesBeneath() + 1;
            }
            return total;
        }

        /**
         * Returns the pathway through a reverse walk up the tree,
         * procedurally generating the new pathway.
         *
         * @return the pathway of this branch
         */
        public String getPathway() {
            if (parent != null) {
                return appendPath(key);
            } else {
                return key;
            }

        }

        /**
         * Appends the name of itself to the front of the existing string,
         * creating a path. It will finish when it is at the root.
         *
         * @param builder - the current string
         *
         * @return pathway at this level
         */
        private String appendPath(String builder) {
            if (parent == null) {
                return key + "." + builder;
            } else {
                return parent.appendPath(key + "." + builder);
            }
        }

        /**
         * Local branch sub-class version of {@link HierarchialTree#pruneBranch(String)}
         *
         * @param name of branch to be pruned
         *
         * @return the pruned branch
         */
        public Branch<K> pruneBranch(String name) {
            Branch<K> branch = subBranches.get(name);
            subBranches.remove(name);
            subBranchList.remove(branch);
            return branch;
        }

        /**
         * Adds a new sub-branch to this branch and returns it.
         * If the pathway does not exist, the system will create a pathway
         * to it. This method can also be used to lookup branches.
         *
         * @param pathway - pathway, with branch order separated by periods.
         *
         * @return final branch created
         */
        public Branch<K> addBranch(String pathway) {
            if (!pathway.contains(".") && !subBranches.containsKey(pathway)) {
                return putBranch(pathway, new Branch<K>(pathway, this));

            } else if (pathway.contains(".")) {
                String head = pathway.substring(0, pathway.indexOf("."));
                if (!subBranches.containsKey(head)) {
                    putBranch(head, new Branch<>(head, this));
                }
                return subBranches.get(head).addBranch(pathway.substring(pathway.indexOf(".") + 1));

            } else {
                return subBranches.get(pathway);
            }
        }
    }


    /**
     * Stores all the roots at the top of the tree
     */
    private final HashMap<String, Branch<K>> roots = new HashMap<>(1, 0.7f);

    /**
     * Stores all the roots in a list in order for fast access
     * while iterating.
     */
    private final List<Branch<K>> rootsList = new ArrayList<>();

    public HierarchialTree() {

    }

    private Branch<K> putBranch(String key, Branch<K> newBranch) {
        rootsList.add(newBranch);
        roots.put(key, newBranch);
        return newBranch;
    }

    /**
     * Master class version of the {@link Branch#addBranch(String)} method
     *
     * @param pathway - pathway, with branch order separated by periods.
     *
     * @return final branch created
     */
    public Branch<K> addBranch(String pathway) {
        if (!pathway.contains(".") && !roots.containsKey(pathway)) {
            return putBranch(pathway, new Branch<K>(pathway, null));

        } else if (pathway.contains(".")) {
            String head = pathway.substring(0, pathway.indexOf("."));
            if (!roots.containsKey(head)) {
                putBranch(head, new Branch<K>(head, null));
            }
            return roots.get(head).addBranch(pathway.substring(pathway.indexOf(".") + 1));

        } else {
            return roots.get(pathway);
        }
    }

    /**
     * Tree walk with System output stream
     * <p>
     * Common use implementation of {@link HierarchialTree#print(OutputStream)}
     */
    public void print() {
        print(System.out);
    }

    /**
     * Walks the tree and prints it out to the output stream
     * <p>
     * root
     * - branch
     * -- subbranch
     * -- subbranch2
     *
     * @param output - could be a file, a packet, or simply the console
     */
    public void print(OutputStream output) {
        for (Entry<String, Branch<K>> branch : roots.entrySet()) {
            try {
                output.write((branch.getKey() + (branch.getValue().size() != 0 ? " (" + branch.getValue().size() + ")" : "") + "\n").getBytes());

            } catch (IOException e) {
                System.err.println("Error writing to output stream");
                e.printStackTrace();
            }

            branch.getValue().print(1);
        }
    }

    /**
     * Prunes the branch described by the pathway
     *
     * @param pathway - pathway ending with branch to be pruned
     *
     * @return pruned branchh
     */
    public Branch<K> pruneBranch(String pathway) {
        if (pathway.contains(".")) {
            String[] split = pathway.split("\\.");
            return addBranch(pathway).parent.pruneBranch(split[split.length - 1]);

        } else {
            Branch<K> rootBranch = roots.get(pathway);
            roots.remove(pathway);
            rootsList.remove(rootBranch);
            return rootBranch;
        }
    }

    /**
     * Adds a new node to the tree, if the pathway
     * does not exist then it will create it.
     *
     * @param pathway - pathway, with branch order separated by periods.
     * @param node - node to be inserted
     */
    public void addNode(String pathway, K node) {
        addBranch(pathway).nodes.add(node);
    }

    /**
     * Fetches a branch's nodes
     *
     * @param pathway - pathway, with branch order separated by periods.
     */
    public List<K> fetchNodes(String pathway) {
        return addBranch(pathway).nodes;
    }

    /**
     * Returns total branches of this tree, including all
     * subbranches.
     *
     * @return total amount of branches
     */
    public int getTotalBranches() {
        int total = 0;
        for (Entry<String, Branch<K>> entry : roots.entrySet())
            total += entry.getValue().totalBranchesBeneath() + 1;

        return total;
    }

    public Iterator<Branch<K>> getRootIterator() {
        return rootsList.iterator();
    }

    public static void main(String[] args) {
        HierarchialTree<String> tree = new HierarchialTree<String>();
        tree.addNode("root.branchA.branchAA.branchAAa", "Lemme know");
        tree.addNode("root.branchA.branchAA.branchAAb", "Lemme know");

        tree.pruneBranch("root.branchA.branchAA");
        tree.print(System.out);

    }
}
