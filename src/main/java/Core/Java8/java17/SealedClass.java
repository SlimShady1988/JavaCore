package Core.Java8.java17;

//sealed class використовується для того, щоб конкретно вказати який клас має право наслідуватись від SEALED класу.

public sealed class SealedClass permits SealedChildClass {

}

final class SealedChildClass extends SealedClass {

}
