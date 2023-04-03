package info.gluu.qa.authn

class PersonChecker {

    static boolean isBob(String email) {
        email.toLowerCase() == "bob@gluu.org"
    }

}
