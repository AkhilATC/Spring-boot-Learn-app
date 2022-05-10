package learn.project;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FileUpload {
    private String filename;
    private String fileType;
    private String fileSize;
    private byte[] file;
}
