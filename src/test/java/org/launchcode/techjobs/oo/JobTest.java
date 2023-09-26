package org.launchcode.techjobs.oo;

import org.junit.Assert;
import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId(){
    Job jobA = new Job();
    Job jobB = new Job();
    Assert.assertNotEquals(jobA.getId(), jobB.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields(){
       Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
               new PositionType("Quality control"), new CoreCompetency("Persistence"));
       assertEquals(job.getName(),"Product tester");
       assertTrue(String.valueOf(job.getName() instanceof String), true);
    }
}

