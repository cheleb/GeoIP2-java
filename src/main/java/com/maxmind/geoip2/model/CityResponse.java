package com.maxmind.geoip2.model;

/**
 * <p>
 * This class provides a model for the data returned by the GeoIP2 Precision:
 * City end point.
 * </p>
 * <p>
 * The only difference between the City and Insights model classes is which
 * fields in each record may be populated.
 * </p>
 * <p>
 * @see <a href="http://dev.maxmind.com/geoip/geoip2/web-services">GeoIP2 Web
 * Services</a>
 * </p>
 */
final public class CityResponse extends AbstractCityResponse {
    public CityResponse() {
        // For Jackson
    }
}
