gigglesProper


what I want to learn
-how controllers work
- Restful web service
    -get, put, post, delete   done!!!!
-json stuff? done!!!!
-gitkraken practice  done!!!!
-go from objects to html? done!!!!
-thymeleaf   done!!!!
-all the werid spring boot annotations - override, controller, service, autowired, entity, table, column, id, repository
       requestmapping, 
- how to display from a java object to a webpage, gonna used thymeleaf like a pro !!!!!
- probs going to have to learn api stuff if I want this thing to post and display? check how it was done in reddit example


things to implement
- homepage it
- figure out what's going on with css and make it look all pretty
- frame it as entities and repositories, so far it's just classes
- display a set amount of data
- make a form for new data to be entered on page (later, just java it for now)
- add new data (java to begin)
- entities and repositories of gigs  (data directory)
- controller (web directory)
- javascript, thymeleaf, html, JSON connective tissue to allow me to display stuff
- static directory under resources for css, js and index (do all the front end at home lovely:)
- css your table and make it look pretty


round 2 stuff
- add different user accounts?
- make it email for me, going to need email info from db, along with contact sched and last contacted date


doing now top, already done underneath
- css day
    - put all my tables under 1 css tag
    -changed color scheme and added flexbox to my table
    -tried changing a bunch of stuff and realized that my page is not reflecting my updates css
        - it's got something to do with the static resources and it looks like I need to build a webconfig to actually make changes
        - nm, did some more googling and it turns out that there was a property I needed to set that keeps my page from storing chaches
- add a delete function
    - add a confirmation button
    - completed back end logic that takes id number and deletes it from my database
    - got buttons on the table to return a gig model with the id number to my controller
    - added buttons to the table
- add an edit function
    -changed output of postpage so it redirects to the main display page rather than creating it's own url. Job complete!
    - adding a confirmation page so people can confirm before they make changes
        - cancel button links back to the main display page
        - ok button posts to database and goes to seperate page, need to change it so it redirects to the display page
    - do a post request from GigEdit page
    - Adding abstraction to program, cleaning up the structure for my findAll requests as I need it for my edit page
        - moved the findAll from mapper class to repository
    - tied in edit page to css stuff so it looks all pretty
    -buttons now point to a new html page that displays the bits of data that are going to be edited
        - I'm putting an extra post b/c this was a huge step (basically all the get stuff for an edit page)
        - made a new part of my mapper to get individual rows
        - made repository and service layer and split up my functions that way
        - passed a number from my button into the url then passed that into my controller to get the right id
        - this was a lot, good job you :D
    -get buttons to point to a new html page for editing
    -add buttons to id rows.
    -added ids to my database
- be able to add something to database
    - make the form fit the table just for funsies
    - adds form result to database
    - save results to my project
    - added a form to my html
- tied it into database with jdbc
- display multiple objects to a table from a json file
- display the object from a json file to the page
- make an object from a json file
- make a table composed from info from one object
- created gig_display page and displayed a set table
- making objects
- hello world