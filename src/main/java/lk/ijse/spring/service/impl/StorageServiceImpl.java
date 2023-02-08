package lk.ijse.spring.service.impl;

import com.mysql.cj.protocol.x.MessageConstants;
import lk.ijse.spring.service.StorageService;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.Transactional;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
@Service
@Transactional
public class StorageServiceImpl  implements StorageService {
    private final Path root = Paths.get("uploads");
    @Override
    public void init() {
        try {
            Files.createDirectory(root);
        } catch (Exception e) {
            throw new RuntimeException();
        }


    }

    @Override
    public void store(MultipartFile file) {

    }

    @Override
    public Stream<Path> loadAll() {
        try {
            return Files.walk(this.root, 1).filter(path -> !path.equals(this.root)).map(this.root::relativize);

        } catch (Exception e) {
            throw new RuntimeException();
        }
    }


    @Override
    public Path load(String filename) {
        return root.resolve(filename);
    }

    @Override
    public Resource loadAsResource(String filename) {
        try {
            Path path = root.resolve(filename);
            Resource resource = new UrlResource(path.toUri());
            if (resource.exists() || resource.isReadable()) {
                return resource;
            } else {
                throw new RuntimeException();
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public void deleteAll() {

    }

}
