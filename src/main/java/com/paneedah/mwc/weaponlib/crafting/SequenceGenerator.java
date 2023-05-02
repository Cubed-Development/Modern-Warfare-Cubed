package com.paneedah.mwc.weaponlib.crafting;

import com.paneedah.mwc.weaponlib.crafting.OptionsMetadata.OptionMetadata;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SequenceGenerator {
    
    private static final String ALG_NAME = "SHA1PRNG";
    
	private Map<List<Object>, Object> uniqueSequenceMap;
    private SecureRandom random;
    private int slotCount;
    
    SequenceGenerator(int slotCount)  {
        this.slotCount = slotCount;
        this.uniqueSequenceMap = new HashMap<>();
        try {
			this.random = SecureRandom.getInstance(ALG_NAME);
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException("Failed to initialize sequence generator: " + e, e);
		}
    }
    
    public List<Object> generate(Object obj, byte[] seed, OptionsMetadata optionMetadata) {
        random.setSeed(seed);
        return generateUniqueSequence(obj, optionMetadata);          
    }
    
    private List<Object> generateUniqueSequence(Object obj, OptionsMetadata optionMetadata) {
        List<Object> result;
        do {
            result = generateSequence(optionMetadata.getMetadata());
        } while(uniqueSequenceMap.putIfAbsent(result, obj) != null);
        return result;
    }
    
    private List<Object> generateSequence(OptionMetadata[] optionMetadata) {
        Object[] slotValues = new Object[slotCount];
        int optionDistribution[] = new int[optionMetadata.length];
        do {
            Arrays.fill(optionDistribution, 0);
            Arrays.fill(slotValues, 0);
            for(int slot = 0; slot < slotCount; slot++) {
                int selectedOption = random.nextInt(optionMetadata.length);
                optionDistribution[selectedOption]++;
                slotValues[slot] = optionMetadata[selectedOption].getOption();
            }
        } while (!hasSufficientDistribution(optionDistribution, optionMetadata));
        return Arrays.asList(slotValues);
    }
    
    private boolean hasSufficientDistribution(int slotDistribution[], OptionMetadata[] optionMetadata) {
        boolean result = true;
        for(int i = 0; i < slotDistribution.length; i++) {
            if(slotDistribution[i] < optionMetadata[i].getMinOccurs() 
            		|| slotDistribution[i] > optionMetadata[i].getMaxOccurs()) {
                result = false;
                break;
            }
        }
        return result;
    }
}
