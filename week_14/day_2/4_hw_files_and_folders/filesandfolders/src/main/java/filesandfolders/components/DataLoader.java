package filesandfolders.components;

import filesandfolders.controllers.FileController;
import filesandfolders.models.File;
import filesandfolders.models.Folder;
import filesandfolders.models.Person;
import filesandfolders.repositories.FileRepository;
import filesandfolders.repositories.FolderRepository;
import filesandfolders.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private FileRepository fileRepository;
    @Autowired
    private FolderRepository folderRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Person dave = new Person("Dave");
        personRepository.save(dave);
        Person sue = new Person("Sue");
        personRepository.save(sue);

        Folder pictures = new Folder("Pictures", sue);
        folderRepository.save(pictures);
        Folder documents = new Folder("Documents", sue);
        folderRepository.save(documents);
        Folder pictures1 = new Folder("Pictures", dave);
        folderRepository.save(pictures1);
        Folder documents1 = new Folder("Documents", dave);
        folderRepository.save(documents1);

        File picture1 = new File("Swimming with dolphins", ".jpg", "7KB", pictures);
        fileRepository.save(picture1);
        File picture2 = new File("Kayak in Norway", ".jpg", "10KB", pictures);
        fileRepository.save(picture2);
        File picture3 = new File("CV", ".pdf", "12KB", documents);
        fileRepository.save(picture3);
        File picture4 = new File("Council tax bill", ".pdf", "8KB", documents);
        fileRepository.save(picture4);
        File picture5 = new File("Swimming with sharks", ".jpg", "7KB", pictures1);
        fileRepository.save(picture5);
        File picture6 = new File("Kayak in Philippines", ".jpg", "10KB", pictures1);
        fileRepository.save(picture6);
        File picture7 = new File("My CV", ".pdf", "12KB", documents1);
        fileRepository.save(picture7);
        File picture8 = new File("Electric bill", ".pdf", "8KB", documents1);
        fileRepository.save(picture8);
    }
}
