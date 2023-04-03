package info.gluu.qa.authn

class PersonChecker {

    static boolean isBob(String username) {
        username.toLowerCase() == "bob"
    }

}
