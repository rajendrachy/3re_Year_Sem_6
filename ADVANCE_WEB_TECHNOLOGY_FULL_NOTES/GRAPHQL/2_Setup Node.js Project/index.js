const express = require("express");
const schema = require("./schema");

const app = express();


const {graptqlHttp} = requirea("express-graphql");


app.use("/graphql", graptqlHttp({
schema,
graphiql:true,

}));


app.listen(4000, () => {
  console.log("Server running");
})




