package edu.sjsu.cmpe.cache.client;

/**@author IzharR
 * Cache Service Interface
 */
public interface CacheServiceInterface {
    public String get(long key);

    public void put(long key, String value);

    public String getServerURL();
}
