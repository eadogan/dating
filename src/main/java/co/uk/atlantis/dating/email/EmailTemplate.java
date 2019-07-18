package co.uk.atlantis.dating.email;

public enum EmailTemplate {

    FORGOT_PASSWORD("forgot-password"),
    WELCOME("welcome");

    private String templateName;

    EmailTemplate(final String templateName) {
        this.templateName = templateName;
    }

    public String templateName() {
        return templateName;
    }

}