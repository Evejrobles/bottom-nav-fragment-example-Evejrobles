# Example: Bottom Navigation w/ Fragments

## Introduction

This project is a slightly modified version of that generated by the **New Android Project** wizard, with **Bottom Navigation Activity** as the initial activity. Your challenge is to add a small set of features to the app, primarily using fragments.

## Tasks

1. **Style and populate `fragmentTitle`.**

    The `MainActivity` class has a `TextView` field named `fragmentTitle`. In the `onCreate` method, this field is assigned to refer to an object in the inflated `activity_main` layout.
    
    * By creating a `style` definition, and referring to that style in the appropriate element of `activity_main.xml`, make this field `bold` with a size of `18sp`.
    
    * Modify `MainActivity.java` so that when the user selects one of the navigation buttons at the bottom of the screen, the `fragmentTitle` contents are set to the title of the selected button. (Hint: You can take this text directly from the selected `MenuItem`.)
    
2. **Add a fragment container element to `activity_main.xml`.**

    The new element must be added below the existing `TextView`, and above the `BottomNavigationView`, and should take up all the screen space between them, less padding. (This padding can be specified as a margin around this element; don't forget to take advantage of suitable margin/padding values that are already defined.) Be sure to specify an `id` for this element, so that you can refer to it in the relevant `FragmentTransaction` method calls.

3. **Define a `Fragment` class (with accompanying layout file) corresponding to each navigation button.**

    Each of these fragments will contain entirely different content, so you will need 3 classes, and 3 layout files. The contents of the fragments must be as follows:
    
    * **Home**
    
        Between 3 and 5 paragraphs of Lorem ipsum text, as returned by the `getParagraphs` method of the `com.thedeanda.lorem.LoremIpsum` class (see https://github.com/mdeanda/lorem). Make this text scrollable, if possible. (Hint: Add this module to your project by modifying your app-level `build.gradle` file, adding the Maven coordinates of the module to your `dependencies` section.)
        
    * **Balloon Fiesta**
    
        The image located at https://upload.wikimedia.org/wikipedia/commons/f/f3/Albuquerque_BalloonFiesta.jpg. (Hint: You can download that image and add it to your project, and reference it as a `Drawable`.)
        
    * **Day of the Dead**
    
        A `RadioGroup` of `RadioButton` objects, labeled with the 3 dates spanned by the Day of the Dead celebrations: Oct. 31, Nov. 1, and Nov. 2. These radio buttons can be left-aligned in the fragment; for an additional challenge, space them evenly in the vertical direction, and cascade them horizontally: the first button left-aligned, the second center-aligned, and the third right-aligned.

4. **Load each fragment when the corresponding button is clicked.**

    When each button is clicked, an instance of the corresponding fragment should replace any fragment currently displayed. (Note: When using the bottom navigation scheme, adding fragments to the stack is generally not needed.) In this case, since the fragments don't need to maintain any content between selections, you can create a new instance each time a fragment is displayed.
    
Don't forget to commit and push your work! (Remember that the work is already coming from a GitHub repository, and is cloned to a local repository; there's no need to create new local or remote repositories in this case.)