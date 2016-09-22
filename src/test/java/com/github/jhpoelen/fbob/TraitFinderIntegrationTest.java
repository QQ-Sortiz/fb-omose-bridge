package com.github.jhpoelen.fbob;

import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TraitFinderIntegrationTest {

    @Test
    public void findLifeSpanDynamic() throws IOException, URISyntaxException {
        final Map<String, String> speciesProperties = TraitFinder.findTraits(new Taxon("ScomberomorusCavalla"), getClass().getResourceAsStream("fishbase-mapping.csv"));
        assertThat(speciesProperties.get("species.lifespan.sp"), is("14.0"));
    }

}