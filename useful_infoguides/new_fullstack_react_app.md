Steps:
create top level project folder e.g. hotel-checkins

in terminal, cd into the project folder (e.g. hotel-checkins) and run npx 

create-react-app client  - this will create the client folder and its code inside of the top-level project folder hotel-checkins

in terminal, cd into the project folder (e.g. hotel-checkins) and run mkdir server then cd into the server folder and run npm init -y

in terminal, in the server folder, run npm install express mongodb@3.5.7 cors to install the three required dependencies

in the same folder, run npm install -D nodemon to get the nodemon dev dependency installed which will listen for changes to your files

in the package.json file in the server folder, add "server:dev": "nodemon server.js"  to the list of scripts so you can run the server using npm run server:dev and it will listen for code changes without you having to manually restart the server