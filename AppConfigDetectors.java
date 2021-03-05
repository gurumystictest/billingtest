package com.amazonaws.guru.detectorConfig;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.AllArgsConstructor;

/**
 * AppConfigDetectors provides a list of detector config class.
 */

@SuppressFBWarnings({"EI_EXPOSE_REP", "EI_EXPOSE_REP2"})
@AllArgsConstructor
public class AppConfigDetectors {
    // Not use lombok here to avoid EI_EXPOSE_REP build failure
    // https://sage.amazon.com/posts/231943
    private final AppConfigDetector[] detectors;

    public AppConfigDetector[] getDetectors() {
        if (detectors == null) {
            return null;
        }

        AppConfigDetector[] arr = new AppConfigDetector[detectors.length];
        for (int i = 0; i < detectors.length; i++) {
            AppConfigDetector detector = detectors[i];
            arr[i] = new AppConfigDetector(detector.getName(), detector.getIsEnabled());
        }
        return arr;
    }
}
