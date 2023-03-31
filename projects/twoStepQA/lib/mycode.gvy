package info.gluu.qa

class PersonChecker {

    static boolean notBob(String username) {
        username.toLowerCase() != "bob"
    }

}