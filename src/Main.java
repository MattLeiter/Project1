public class Main {
/*
Movement:
Char can move left or right. This should be controlled by the left and right
arrow navigation keys on the keyboard.
 The rate of movement is up to you but it should be fast enough not to bore you and slow enough to
be controllable.
The speed of movement should be the same regardless of the machine
you are running on, i.e. movement should be based on wallclock-time and not CPU
speed.

Shooting:
 Char can shoot at other characters in the game. Char will shoot when the “s”
key is pressed and the shots will travel N number of units, where you can pick N. If the
“s” key is held down for some period of time (you should pick this interval to make the
game playable) Char will shoot in automatic mode, i.e. shots will be fired continuously.
Again, you can pick the rate at which shots will be fired but it should be fast enough to be
effective and slow enough that the grader can tell that separate shots are being fired.
After 10 shots are fired continuously in automatic mode the Char cannot fire again for
one second. Every shot fired should be accompanied by a sound. Every time Char hits a
creature there should be a different sound. Every time Char kills a creature there should
be a different sound.


Health:
Char will start out with a health rating of 20 and can have a maximum health
rating of 40. Every unit of movement will increase Char’s health by 1. For every 1
second that Char is motionless Char’s health will increase by 5. Char’s health will
increase by +10 for every creature killed. Char’s health will decrease by -5 every time
Char is hit.


Creatures:
There is a single kind of creature (called Creature) and it doesn’t like Char.
If Char enters the same screen as a Creature it will wait for 1/2 second or until Char
moves two units and then it will begin shooting at Char. A Creature will shoot at 1/2 the
rate that Char does when the “s” key is held down. It will shoot straight ahead from
whatever height you make Char. It’s height should be less than or equal to Char’s so that
it can hit Char. The Creature will advance on Char at whatever speed you desire after it
begins shooting. If Char hits a creature, either because Char ran into the creature or the
creature ran into Char, Char dies.

Score display:
In the upper part of the screen Char’s health should be displayed and updated as
actions occur

Game setup:
If no block information is used the map will initialize to a flat surface that plays the same as all
normal blocks laid out on a level playing surface.
Data to display Char, etc. are read. You can either use graphics files for these or simply
letters or other characters. At least one Character, creature or magic item should be a
graphic.
Creatures placement should be done as part of the game setup. This will allow games to
be repeatable and aid in debugging.
The score and health information is initialized to the starting values.
Char is placed at the leftmost part of the screen.
Any other initialization you need to perform.
The game begins


 */
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
