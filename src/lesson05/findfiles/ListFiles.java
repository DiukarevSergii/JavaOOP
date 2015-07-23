package lesson05.findfiles;

public class ListFiles {
    protected String srcPath;
    protected String ext;

    public ListFiles(String srcPath, String ext){
        this.srcPath = srcPath;
        this.ext = ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public void setSrcPath(String srcPath) {
        this.srcPath = srcPath;
    }

    public String getExt() {
        return ext;
    }

    public String getSrcPath() {
        return srcPath;
    }
}
