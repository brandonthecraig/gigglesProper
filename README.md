gigglesProper


what I want to learn
-how controllers work
- Restful web service
    -get, put, post, delete
-json stuff? done!!!!
-gitkraken practice
-go from objects to html? done!!!!
-thymeleaf
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

current plan
- need to delete stuff
- put a button next to each of the items on the table that sends a delete request
- get the data from the table somehow? use that to id what to take out of the database
- buttons so going to need clicky bits into my html (event logger?)
- need to abstract all my stuff. Take things out of the controller, add a service layer (doing things to the data, filtering? Like picking one id?) 
and a repository layer (getting data from database, Strings and gets and stuff)
- sort out a repository and entity thing, use the boilerplate part of spring to make this all cleaner and easier
- do this next, restructure program
- figure out swagger, get that mofo working on here
- change all my references to controller from html to use the format of my post request on the edit page


doing now top, already done underneath
- add an edit function
    - do a put request from GigEdit page
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