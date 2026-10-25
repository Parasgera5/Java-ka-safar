// Junit
// Testing vs unit Testing
// testing -> done by test engineer (sdet, qa team, etc)
// unit testing -> done by the developer(SDE / SWE) itself who is building it. during development it is done.

// SDLC -> Software development life cycle
//     design
//     develop(coding)
//     testing -> whether fine as per expectatino or not, done post the development, done by test engineers



// example in application there is a function to execute some behaviour or may be a group of functions in order to perform some behavior.
// that functions is called one unit of the application
// unit -> a single method or a group of methods related to each other to perform only a specific task/behavior.

// now we test that unit and that is unit testing if failed we modify else move forward.

// that same test can be used further as well to test again and again to check if the unit is still working fine after any modification or enhancement in the code. because maybe there is a chance that changing or introducing some new code may break the existing code unit. so we check that again by the previously written test cases to check if the unit is still working fine or not. that is called regression testing. so unit testing is done by the developer and regression testing is done by the test engineer.



// unit Testing
//     prepare (setup a test environment, write test methods, etc)
//     provide testing input
//     run the test
//     provide expected output
//     perform assertion (verify the result)
//     report test result, alert developer if failed or passed



// junit5 -> it is not junit4 + new features

// junit5 platform - environment to run test cases, we will not deirectly interact with this platform we will be using junit5 jupiter api to write test cases and junit5 vintage api to run junit4 test cases.
//     junit-platform-commons
//     junit-platform-engine
//     junit-platform-launcher
//     junit-platform-runner
//     junit-platform-suite-api
//     junit-platform-suite-engine

// jupiter api interacts with platform and that ecosystem.

// junit5 does not provide backward compatibility for junit4 test cases. so junit5 vintage api is provided to run junit4 test cases. here for junit 4 test cases vintage api interacts with that platfrom ecosystem.

// extension -> enhance the testing capabitlity of junit 5. without extension junit5 is not complete. extension is a way to add new functionality to junit5. it is a way to extend the functionality of junit5. it is a way to add new features.
// if dont want to use jupiter we can interact with platform through this extension as well.



