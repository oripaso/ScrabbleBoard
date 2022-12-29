/*
    Ori Paso - 209493683
 */
package test;
import java.util.HashSet;
import java.util.Objects;

public class CacheManager {

    private int cacheSize;
    private HashSet<String> set = new HashSet<>();

    CacheReplacementPolicy crp;

    // constructor of cache manager
    public CacheManager(int Size ,CacheReplacementPolicy cashReplacement)
    {
        this.cacheSize = Size;
        this.crp = cashReplacement;

    }

    // Add word to the cache by the rules of the crp
    public boolean query (String word)
    {
        return set.contains(word);
    }

    public void add (String word)
    {
        if(set.size() >= cacheSize)
        {
          String removed = crp.remove();
          set.remove(removed);
        }

        crp.add(word);
        set.add(word);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CacheManager that = (CacheManager) o;
        return cacheSize == that.cacheSize && Objects.equals(set, that.set) && Objects.equals(crp, that.crp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cacheSize, set, crp);
    }
}
