# vsobuildpagerefresh
Visual Studio Build Page Refresh

# Create a new jar file
*Create JAR module*
- File -> Project Structure -> Project Settings -> Artifacts -> Click plus sign -> Jar -> From modules with dependencies...
The above sets the "skeleton" to where the jar will be saved to. To actually build and save it do the following:
- Select Main Class.
- Select Extract to the target JAR radio button
- Select path to `Directory for META-INF/MANIFEST.MF:`
- click OK

*Build a JAR Artifact*
- Go to Build -> Build Artifact
- Point to jar and select **Build**(Check out/artifacts folder, you'll find your JAR there.)
