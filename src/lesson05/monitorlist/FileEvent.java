package lesson05.monitorlist;

public class FileEvent implements IFileEvent {
    @Override
    public void onFileAdded() {
        System.out.println("File added!");

        /*File f = new File();
        long l = f.lastModified();
        Date d = new Date(l);

        System.out.println(d.toString());*/
    }
}
