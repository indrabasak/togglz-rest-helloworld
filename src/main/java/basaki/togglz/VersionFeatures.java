package basaki.togglz;

import org.togglz.core.Feature;
import org.togglz.core.annotation.EnabledByDefault;
import org.togglz.core.annotation.Label;
import org.togglz.core.context.FeatureContext;

/**
 * 
 * <tt>VersionFeatures</tt> declares the REST service version Togglz features
 * that are used in the application.
 * <p/>
 * 
 * @author Indra Basak
 * 
 */
public enum VersionFeatures implements Feature {

    /**
     * REST service version Feature. If the feature is true, version 1 of the
     * customer service implementation will be used, otherwise version 2 of the
     * customer service implementation
     */
    @EnabledByDefault @Label("REST Version Feature") REST_VERSION_FEATURE;

    /**
     * Checks if the feature is active.
     * 
     * @return true is the feature is active, false otherwise
     */
    public boolean isActive() {
	return FeatureContext.getFeatureManager().isActive(this);
    }

}
