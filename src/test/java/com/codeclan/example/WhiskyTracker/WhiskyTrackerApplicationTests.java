package com.codeclan.example.WhiskyTracker;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.RegionType;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WhiskyTrackerApplicationTests {

	@Autowired
	WhiskyRepository whiskyRepository;

	@Autowired
	DistilleryRepository distilleryRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canFindWhiskiesByYear(){
		List<Whisky> whiskies = whiskyRepository.findWhiskiesByYear(1991);
		assertEquals(1, whiskies.size());
	}

	@Test
	public void canFindDistilleriesByRegion(){
		List<Distillery> distilleries = distilleryRepository.findDistilleriesByRegion("Highland");
		assertEquals(1, distilleries.size());
	}

	@Test
	public void canFindWhiskiesByDistilleryIdAndAge(){
		List<Whisky> whiskies = whiskyRepository.findWhiskiesByDistilleryIdAndAge(1L, 15);
		assertEquals(1, whiskies.size());
	}

	@Test
	public void canGetOrdinal(){
		assertEquals(1, RegionType.LOWLAND.getOrdinal());
	}


}
