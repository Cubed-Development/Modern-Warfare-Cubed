# Contributing guide for Modern Warfare Cubed

This project follows [Keep a Changelog] and [Ragnarök Versioning Convention]

## Writing Good Issues

Submitting an Issue about a bug or feature request is the easiest way to contribute, however, to get the most use out of them, you should follow certain guidelines. 

Be respectful and kind, especially if you're requesting a feature. If you believe you have found a bug, screenshots/recording are extremely helpful. Check if someone has created an issue for your bug, duplicit reports split up information! If you see a report about a bug you are experiencing, feel free to add more screenshots and steps you have done to find the bug.      

## Editing Code
This is the hardest, but most helpful, way to contribute, provided you do it correctly    

### Cloning the repository

*This assumes that you have [GitHub Desktop] installed*

Go on the [main GitHub page of MWC] then click the green code button, it will open a little popup in that popup click `Open with GitHub Desktop`
![image](https://user-images.githubusercontent.com/82710983/221866888-fe7a72ce-52bd-4955-b10e-0de36e6676b9.png)

This should open [GitHub Desktop] just follow the instructions and wait for it to download.

### Opening in IntelliJ IDEA

*This assumes that you have [IntelliJ Idea] installed*

Launch IntelliJ Idea, then click `Open` navigate to the repository you just cloned, and select the `build.gradle` file and click `Ok`it will prompt you if you want to open as a file or project click `Open as Project`, wait for the importing to finish.

### The setup

Open the Gradle panel on the right side of IntelliJ IDEA then open the `Tasks` "folder" then `forgegradle` now double click `setupDecompWorkspace`.

Once the `setupDecompWorkspace` has finished, reload Gradle, once finished double click `runClient` to launch the client, same for `runServer` except it launches the server.


---

## Making changes

Before making any changes, create a new branch. This will help you keep your changes separate from the main codebase and make it easier to collaborate with other contributors. To create a new branch, click on the branch selector in the top-left corner of GitHub Desktop, then click "New branch" and give your branch a descriptive name.

Make your changes in IntelliJ IDEA. When you're done, save your changes and commit them to your branch in GitHub Desktop. Be sure to write a clear and descriptive commit message that explains the changes you made.

---

## Creating a pull request

When you're ready to share your changes with the project, create a pull request. To do this, go to the [main GitHub page of MWC] and click the "Pull requests" tab. Then click the green "New pull request" button.

Select the branch that contains your changes and the branch that you want to merge your changes into. This is usually the main branch of the repository.

Write a clear and descriptive title for your pull request. In the description, explain the changes you made and why you made them. Be sure to mention any related issues or pull requests that your changes address.

Review your changes and make sure everything looks good. Then click the green "Create pull request" button.

Wait for your pull request to be reviewed by other contributors. You may need to make some changes based on their feedback. Once your pull request is approved, your changes will be merged into the main codebase.

---

## Conclusion
Remember to always communicate clearly with other contributors and follow the project's coding standards and guidelines. __Good luck with your contributions to Modern Warfare Cubed!__


[Keep a Changelog]: https://keepachangelog.com/en/1.0.0/
[Ragnarök Versioning Convention]: https://gist.github.com/Desoroxxx/5d4a45785ce19a6653ba99f72325c703

[Main GitHub page of MWC]: https://github.com/Paneedah/Modern-Warfare-Cubed
[GitHub Desktop]: https://desktop.github.com/
[IntelliJ Idea]: https://www.jetbrains.com/idea/
