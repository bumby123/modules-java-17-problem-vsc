// module zoo.animal.talks {
// exports zoo.animal.talks.content;
// exports zoo.animal.talks.media;
// exports zoo.animal.talks.schedule;
// requires zoo.animal.feeding;
// requires zoo.animal.care;
// }

// module zoo.animal.talks {
// exports zoo.animal.talks.content to zoo.staff;
// exports zoo.animal.talks.media;
// exports zoo.animal.talks.schedule;

// requires zoo.animal.feeding;
// requires zoo.animal.care;
// }

// module zoo.animal.talks {
// exports zoo.animal.talks.content to zoo.staff;
// exports zoo.animal.talks.media;
// exports zoo.animal.talks.schedule;

// // no longer needed requires zoo.animal.feeding;
// // no longer needed requires zoo.animal.care;
// requires transitive zoo.animal.care;
// }

// module zoo.animal.talks {
//     opens zoo.animal.talks.schedule;
//     opens zoo.animal.talks.media to zoo.staff;
// }
