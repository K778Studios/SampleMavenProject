package Service;

import org.springframework.stereotype.Service;

@Service
public interface SpongeBobMemeTextGeneratorService {

    String getGeneratedText(String originalText);
}
