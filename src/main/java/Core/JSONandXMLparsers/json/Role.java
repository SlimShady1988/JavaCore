package Core.JSONandXMLparsers.json;

public class Role {
    private boolean frontend;
    private boolean backend;
    private boolean fullstack;

    public Role(boolean frontend, boolean backend, boolean fullstack) {
        this.frontend = frontend;
        this.backend = backend;
        this.fullstack = fullstack;
    }

    public Role() {
    }

    public boolean isFrontend() {
        return frontend;
    }

    public void setFrontend(boolean frontend) {
        this.frontend = frontend;
    }

    public boolean isBackend() {
        return backend;
    }

    public void setBackend(boolean backend) {
        this.backend = backend;
    }

    public boolean isFullstack() {
        return fullstack;
    }

    public void setFullstack(boolean fullstack) {
        this.fullstack = fullstack;
    }

    @Override
    public String toString() {
        return "Role{" +
                "frontend=" + frontend +
                ", backend=" + backend +
                ", fullstack=" + fullstack +
                '}';
    }
}
