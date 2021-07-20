package Service;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class SpongeBobMemeTextGeneratorServiceImpl implements SpongeBobMemeTextGeneratorService {

    @Override
    public String getGeneratedText(String originalText) {

        // Do stuff
        String formattedString = "";

        char lastCharacter = originalText.charAt(0);

        for (char currentCharacter : originalText.toCharArray())
        {
            formattedString += nextLetter(lastCharacter, currentCharacter);
        }

        return formattedString;
    }

    /**
     * This private method takes two arguments, last and current character.
     * There is a chance that the next character will be the same as the last, but very slim.
     * @param lastChar
     * @param nextChar
     * @return
     */
    private char nextLetter(char lastChar, char nextChar)
    {
        boolean upperCase = Character.isUpperCase(lastChar);

        Random val = new Random();
        boolean keepCase = val.nextInt(25) == 0;

        if (keepCase)
        {
            return nextChar;
        }
        else
        {
            if (upperCase)
                return Character.toUpperCase(nextChar);
            else
                return Character.toLowerCase(nextChar);
        }
    }

}

