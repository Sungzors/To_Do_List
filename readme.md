readme.md

To-Do List App!

How to use:

Turn on the app, and you will automatically enter the main menu.

The main menu contains the title, a randomized message that changes upon exiting and re-entering the app.

Here you will be able to either choose between entering the to-do list app or a timeline page by pressing the buttons below.

Currently, timeline function has not yet been implemented.

pic

blurb


Database:

Since the first rendition of the app was made with no clear information on how the database for Android apps would work, I had to assume a lot of things and create a structure that has absolutely no compatibility with SQLite.  So pretty much, I had to rewrite almost everything.

Calendar class ultimately ended up being nothing more than for the method of getInstance, and I relied on the Date data type of the SQLite to hopefully give me the result that I would want, but it also heavily interfered with the function I had put in place to automatically fix dates that were before the created date.

I also had to scrap the sort classes I had made because SQLite could do pretty much the same things

I also lost precision on the dates to the millisecond that I used to have, but I think it not only doesn't really affect the app greatly, but also can be remedied by inserting extra numbers into the date format. It actually turned out tho, that they can only be really compared when the date is stored

I must've spent more time on the date than pretty much everything else in the app combined times 2.