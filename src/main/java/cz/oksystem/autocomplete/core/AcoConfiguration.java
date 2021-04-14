package cz.oksystem.autocomplete.core;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;

/**
 * Konfigurace našeptávače
 */
@Data
public class AcoConfiguration {

    /**
     * Každý znak patří do nějaké skupiny, kterou je vždy při vyhledávání nahrazen
     * Skupina -1 reprezentuje znaky, které jsou při vyhledávání ignorovány a slouží také pro oddělování slov
     */
    public static final int CHARACTER_CLASS_TO_IGNORE = -1;

    private final int searchWordPrefixMatch;
    private final int searchWordMiddleMatch;
    private final int responseObjectsLimit;
    private final List<AcoRange> indexLevelObjectsLimit = new ArrayList<>();

    private final int[] characterClasses = new int[Character.MAX_CODE_POINT];
    private final List<Character> characterClassRepresentants = new ArrayList<>();
    private int characterClassesCount = 0;

    public AcoConfiguration(List<String> characterClasses, int searchWordPrefixMatch, int searchWordMiddleMatch,
                            int responseObjectsLimit, String indexLevelObjectsLimit) {
        if (characterClasses != null) {
            for (String characterClass : characterClasses) {
                if (characterClasses.size() > 0) {
                    for (int i = 0; i < characterClass.length(); i++) {
                        char character = characterClass.charAt(i);
                        this.characterClasses[character] = characterClassesCount;
                        this.characterClasses[toUpperCase(character)] = characterClassesCount;
                        this.characterClasses[toLowerCase(character)] = characterClassesCount;
                    }
                    characterClassesCount++;
                    this.characterClassRepresentants.add(characterClass.charAt(0));
                }
            }
        }
        this.searchWordPrefixMatch = searchWordPrefixMatch;
        this.searchWordMiddleMatch = searchWordMiddleMatch;
        this.responseObjectsLimit = responseObjectsLimit;
        if (indexLevelObjectsLimit != null) {
            String[] ranges = indexLevelObjectsLimit.split("-");
            for (String range : ranges) {
                this.indexLevelObjectsLimit.add(new AcoRange(range));
            }
        }
    }

    public String getCharacterClassRepresentants(int[] token) {
        StringBuilder rv = new StringBuilder(token.length);
        for (int j : token) {
            rv.append(characterClassRepresentants.get(j));
        }
        return rv.toString();
    }

    public int[] getCharacterClasses() {
        return characterClasses;
    }

    public int getCharacterClassesCount() {
        return characterClassesCount;
    }

}
