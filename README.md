# RNGPlugin
A plugin for my adventure maps which provides a way to get random numbers for scoreboard variables

## What is this for?
I made this plugin out of frustration of there being no way to get a psudorandom number in Minecraft for scoreboards, of course you have the adders but they are nowhere near random enough.

I mainly made this for the adventure maps me and my friends make but I felt like releasing it since I thought others might find a use in it.

We don't really release our adventure maps, they're just for us to have a bit of fun which is why a plugin solution like this is fine.

## Extending this
To extend this project you will need
 - Eclipse 4.17.0 or newer
 - At least Java 8 *(although be warned versions such as Eclipse 4.17.0 will only run on Java 11 and newer)*
 - spigot-api 1.16.4
 - spigot-api-javadoc 1.16.4
 
### As as aside Java 8 will soon be unsupported once this plugin supports Minecraft 1.17
### Java 8 versions will still be released for older versions for those who need it.
 
If you would like to upstream your changes this can be done via a pull request.

## THERES ERRORS EVERYWHERE!!!!
You probably forgot to include spigot-api in the ExternalLibs folder

[You can find downloads to spigot-api and the javadoc here](https://hub.spigotmc.org/nexus/content/repositories/snapshots/org/spigotmc/spigot-api/)

When you go to put the files in there you need to name spigot-api `spigot-api.jar` and the javadoc `spigot-api-javadoc.jar`

The result should look like this:

<img src="https://raw.githubusercontent.com/tgpethan/RNGPlugin/master/images/ExternalLibsShouldLookLike.webp" alt="Result Image">
