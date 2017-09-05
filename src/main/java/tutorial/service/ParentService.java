package tutorial.service;

/**
 * @author su-kun1899
 */
public abstract class ParentService {

    public void throwException(boolean error) {
        if (error) {
            throw new RuntimeException("テスト");
        }
    }
}
