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
    @Test
    public void testJobsForEquality(){
        Job jobA = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job jobB = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assert.assertNotEquals(jobA.getId(), jobB.getId());
    }
    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertEquals(job.toString(), System.lineSeparator() + "ID: " + job.getId() + System.lineSeparator() + "Name: Product tester" + System.lineSeparator() + "Employer: ACME"+ System.lineSeparator() + "Location: Desert" + System.lineSeparator() + "Position Type: Quality control" + System.lineSeparator() + "Core Competency: Persistence" + System.lineSeparator());
    }
    @Test
    public void testToStringHandlesEmptyField(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency());
        assertEquals(job.toString(), System.lineSeparator() + "ID: " + job.getId() + System.lineSeparator() + "Name: Product tester" + System.lineSeparator() + "Employer: ACME"+ System.lineSeparator() + "Location: Desert" + System.lineSeparator() + "Position Type: Quality control" + System.lineSeparator() + "Core Competency: Data not available" + System.lineSeparator());
    }
}

