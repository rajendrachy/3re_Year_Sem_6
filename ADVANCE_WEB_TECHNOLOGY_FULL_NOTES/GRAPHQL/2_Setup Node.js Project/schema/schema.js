const {GraphQLSchema, GraphQlObjectType, GraphQLString, GraphQLInt} = require("graphql");
const { resolve } = require("path");


 const Users = [
        {id: '1', name: 'sandeep', age: 25},
        {id: '2', name: 'ram', age: 15},

      ];


const UserType = new GraphQlObjectType({
  name: "User",
  fields: {
    id: {type: GraphQLString},
    name: {type: GraphQLString},
    age:{type: GraphQLInt},

  }
});



const RootQuery = new GraphQlObjectType({
  name : 'RootQueryType',
  fields: {

    user: {
    type: UserType,
    args:{id: {type: GraphQLString}},

    resolve(parent, args) {
       
      const users = [
        {id: '1', name: 'sandeep', age: 25},
        {id: '2', name: 'ram', age: 15},

      ];

     return user.find(user => user.id == args.id);

    }
    },

    

    hello: {
      type: GraphQLString,
      // type: GraphQLInt,
      resolve() {
        return 'Hello from GraphQl';
        // return 12;
      }
    }
  }
})


// Mutation type Working
const Mutation = new GraphQlObjectType({
  name: "Mutation",
  fields: {
    addUser : {
      type: UserType,
      args: {
        name: {type: GraphQLString},
        age:{type: GraphQLInt},
      },

      resolve(parent, args) {
        const user = {
          id: UserType.length + 1 + "",
          name: args.name,
          age: args.age,
        }
        user.push((user));
        console.log(user);
        return user;
      }
    }
  }
})



module.exports = new GraphQLSchema({
  query: RootQuery,
  mutation: Mutation,
})







