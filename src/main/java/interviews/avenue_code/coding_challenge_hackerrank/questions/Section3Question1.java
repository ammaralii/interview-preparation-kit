package interviews.avenue_code.coding_challenge_hackerrank.questions;

public class Section3Question1 {
//    In application.properties file
//    server.address=0.0.0.0
//    server.port=8080
//    file.max-size=100000

//    In RequestController file
//    package com.hackerrank.files;
//
//import java.io.File;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.core.io.Resource;
//import org.springframework.core.io.UrlResource;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.multipart.MultipartFile;
//
//    @RestController
//    public class RequestController {
//        private final Logger log = LoggerFactory.getLogger(RequestController.class);
//
//        public static final String UPLOAD_DIR = "uploads/";
//
//        @Value("${file.max-size}")
//        private long maxSize;
//
//        @PostMapping("/uploader")
//        public ResponseEntity<?> uploader(@RequestParam("fileName") String fileName, @RequestParam("file") MultipartFile file) {
//            log.info("File size is: " + file.getSize());
//            if (file.getSize() > maxSize) {
//                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
//                        .body("Maximum upload size exceeded");
//            }
//
//            // Create the upload directory if it doesn't exist
//            File dir = new File(UPLOAD_DIR);
//            if (!dir.exists()) {
//                dir.mkdirs();
//            }
//
//            // Save the file to the upload directory
//            try {
//                Path filePath = Paths.get(UPLOAD_DIR, fileName);
//                Files.deleteIfExists(filePath);
//                Files.copy(file.getInputStream(), filePath);
//            } catch (IOException e) {
//                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
//                        .body("Failed to upload file.");
//            }
//
//            return ResponseEntity.status(HttpStatus.CREATED).build();
//        }
//
//        @GetMapping("/downloader")
//        public ResponseEntity<?> downloader(@RequestParam String fileName) throws IOException {
//            Path filePath = Paths.get(UPLOAD_DIR + "/" + fileName);
//            Resource resource = new UrlResource(filePath.toUri());
//            if (resource.exists()) {
//                HttpHeaders headers = new HttpHeaders();
//                headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"");
//                headers.add(HttpHeaders.CONTENT_TYPE, Files.probeContentType(filePath));
//                headers.add(HttpHeaders.CONTENT_LENGTH, String.valueOf(resource.contentLength()));
//                return new ResponseEntity<>(resource, headers, HttpStatus.OK);
//            } else {
//                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//            }
//        }
//    }

//    In ApplicationTests file
//    package com.hackerrank.files;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.http.*;
//import org.springframework.test.annotation.DirtiesContext;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.util.LinkedMultiValueMap;
//import org.springframework.util.MultiValueMap;
//
//import java.io.File;
//import java.nio.file.Paths;
//import java.util.Arrays;
//import java.util.Random;
//
//import static org.hamcrest.Matchers.containsString;
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;
//
//    @RunWith(SpringJUnit4ClassRunner.class)
//    @DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
//    @SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
//    class ApplicationTests {
//        public static final String BASE = "uploads/";
//        @Autowired
//        private TestRestTemplate restTemplate;
//
//        @BeforeEach
//        void setUp() {
//            File file = new File(BASE);
//            if (file.exists() && file.isDirectory()) {
//                Arrays.asList(file.listFiles()).forEach(f -> f.delete());
//            }else {
//                file.mkdir();
//            }
//        }
//
//        @Test
//        public void testUpload() {
//            String fileName = "file_" + getRandom(Integer.MAX_VALUE) + ".txt";
//            File uploadedFile = Paths.get(BASE + fileName).toFile();
//            byte[] file = new byte[getRandom(99) * 1024];
//
//            ResponseEntity<Void> response = restTemplate.postForEntity("/uploader", prepareRequest(fileName, file), Void.class);
//
//            assertEquals(HttpStatus.CREATED, response.getStatusCode());
//            assertEquals(true, uploadedFile.exists());
//            assertEquals(true, uploadedFile.isFile());
//            assertEquals(file.length, uploadedFile.length());
//        }
//
//        @Test
//        public void testDuplicateUpload() {
//            String fileName = "file_" + getRandom(Integer.MAX_VALUE) + ".txt";
//            File uploadedFile = Paths.get(BASE + fileName).toFile();
//
//            byte[] file = new byte[getRandom(99) * 1024];
//            ResponseEntity<Void> response = restTemplate.postForEntity("/uploader", prepareRequest(fileName, file), Void.class);
//            assertEquals(HttpStatus.CREATED, response.getStatusCode());
//
//            file = new byte[getRandom(99) * 1024];
//            response = restTemplate.postForEntity("/uploader", prepareRequest(fileName, file), Void.class);
//            assertEquals(HttpStatus.CREATED, response.getStatusCode());
//
//            assertEquals(file.length, uploadedFile.length());
//        }
//
//        @Test
//        public void testFileSizeExceeds() {
//            String fileName = "file_" + getRandom(Integer.MAX_VALUE) + ".txt";
//            File uploadedFile = Paths.get(BASE + fileName).toFile();
//
//            byte[] file = new byte[getRandom(1) * 1024 * 200];
//            ResponseEntity<String> response = restTemplate.postForEntity("/uploader", prepareRequest(fileName, file), String.class);
//
//            assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, response.getStatusCode());
//            assertEquals(false, uploadedFile.exists());
//            assertTrue(containsString("Maximum upload size exceeded").matches(response.getBody()));
//        }
//
//        @Test
//        public void testDownload() {
//            String fileName = "file_" + getRandom(Integer.MAX_VALUE) + ".txt";
//            File uploadedFile = Paths.get("uploads/" + fileName).toFile();
//
//            byte[] file = new byte[getRandom(9) * 1024];
//            ResponseEntity<String> response = restTemplate.postForEntity("/uploader", prepareRequest(fileName, file), String.class);
//            assertEquals(HttpStatus.CREATED, response.getStatusCode());
//
//            HttpHeaders headers = new HttpHeaders();
//            headers.setAccept(Arrays.asList(MediaType.ALL));
//            HttpEntity<String> entity = new HttpEntity<>(headers);
//            ResponseEntity<byte[]> fileResponse = restTemplate.exchange("/downloader?fileName=" + fileName, HttpMethod.GET, entity, byte[].class);
//
//            assertEquals(HttpStatus.OK, fileResponse.getStatusCode());
//            assertEquals(fileResponse.getBody().length, file.length);
//            assertEquals(fileResponse.getBody().length, uploadedFile.length());
//        }
//
//        private HttpEntity<MultiValueMap<String, Object>> prepareRequest(String fileName, byte[] file) {
//            MultiValueMap<String, String> fileInfo = new LinkedMultiValueMap<>();
//            ContentDisposition fileDetails = ContentDisposition
//                    .builder("form-data")
//                    .name("file")
//                    .filename(fileName)
//                    .build();
//            fileInfo.add(HttpHeaders.CONTENT_DISPOSITION, fileDetails.toString());
//            HttpEntity<byte[]> fileEntity = new HttpEntity<>(file, fileInfo);
//
//            MultiValueMap<String, Object> parameters = new LinkedMultiValueMap<>();
//            if (fileName != null) {
//                parameters.add("fileName", fileName);
//            }
//            if (file != null) {
//                parameters.add("file", fileEntity);
//            }
//
//            HttpHeaders headers = new HttpHeaders();
//            headers.setContentType(MediaType.MULTIPART_FORM_DATA);
//
//            HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<>(parameters, headers);
//
//            return requestEntity;
//        }
//
//        private int getRandom(int upperBoundary) {
//            Random random = new Random(1);
//            return random.nextInt(upperBoundary) + 1;
//        }
//    }
}
