# Java-Project-Creator

#### Author: Arthur Sudbrack Ibarra
Automatically create Java projects and open them in Visual Studio Code. (Windows only).

### Setting up the environment:
1. Clone this repository anywhere you wish.
2. Copy the path of the "bin" folder you cloned. (Example: C:\Users\Arthur\Desktop\Java-Project-Creator\bin).
3. Create a path environment variable in your computer with the path you copied. More on how to do that here: https://www.computerhope.com/issues/ch000549.htm

NOTE: jpc.bat and jpc.jar **MUST** be in the **SAME** directory, do not separate them.

### Required Tools:
* Visual Studio Code (https://code.visualstudio.com/)
* Java JDK 1.8.0 or higher (https://www.java.com/download/ie_manual.jsp)

### How to use:
Open a Windows terminal anywhere and type:

> jpc YourProjectName YourMainClassName

You can also ignore the "YourMainClassName" parameter as shown below:

> jpc YourProjectName

By doing that, your main class will be called **"Main"**.

### Demonstration:
<a href="https://drive.google.com/uc?export=view&id=1zsAQF-bxamC9EHQWEqjD30A4l9N9G-sk">
<img src="https://drive.google.com/uc?export=view&id=1zsAQF-bxamC9EHQWEqjD30A4l9N9G-sk" style="max-width: 100%; height: auto" title="Click to enlarge gif"/>