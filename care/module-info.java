
module zoo.animal.care {
    exports zoo.animal.care.medical; //vsc compilation error

    requires zoo.animal.feeding;
}
