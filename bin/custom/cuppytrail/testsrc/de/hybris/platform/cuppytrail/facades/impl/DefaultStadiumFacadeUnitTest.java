package de.hybris.platform.cuppytrail.facades.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import de.hybris.platform.cuppytrail.StadiumService;
import de.hybris.platform.cuppytrail.data.StadiumData;
import de.hybris.platform.cuppytrail.model.StadiumModel;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class DefaultStadiumFacadeUnitTest
{
    private DefaultStadiumFacade stadiumFacade;

    private StadiumService stadiumService;

    private final static String STADIUM_NAME = "wembley";
    private final static Integer STADIUM_CAPACITY = Integer.valueOf(12345);
    private final static String STADIUM_IMAGE_URL = "dummyImageUrl";
    private final static String IMAGE_FORMAT = "dummyFormat";

    // Convenience method for returning a list of Stadium
    private List<StadiumModel> dummyDataStadiumList()
    {
        final StadiumModel wembley = new StadiumModel();
        wembley.setCode(STADIUM_NAME);
        wembley.setCapacity(STADIUM_CAPACITY);
        final List<StadiumModel> stadiums = new ArrayList<StadiumModel>();
        stadiums.add(wembley);
        return stadiums;
    }

    // Convenience method for returning a Stadium
    private StadiumModel dummyDataStadium()
    {
        final StadiumModel wembley = new StadiumModel();
        wembley.setCode(STADIUM_NAME);
        wembley.setCapacity(STADIUM_CAPACITY);
        return wembley;
    }

    @Before
    public void setUp()
    {
        // We will be testing the POJO DefaultStadiumFacade - the implementation of the
        // StadiumFacade interface.
        stadiumFacade = new DefaultStadiumFacade();
        stadiumService = mock(StadiumService.class);

        // We then wire this service into the StadiumFacade implementation.
        stadiumFacade.setStadiumService(stadiumService);
    }

    @Test
    public void testGetAllStadium()
    {
        /**
         * We instantiate an object that we would like to be returned to StadiumFacade when the mocked out
         * StadiumService's method getStadiums is called. This will be a list of two StadiumModels.
         */
        final List<StadiumModel> stadiums = dummyDataStadiumList();
        final StadiumModel wembley = dummyDataStadium();
        // We tell Mockito we expect StadiumService's method getStadiums to be called,
        // and that when it is, stadiums should be returned
        when(stadiumService.getStadiums()).thenReturn(stadiums);

        /**
         * We now make the call to StadiumFacade's getStadiums. If within this method a call is made to StadiumService's
         * getStadiums, Mockito will return the stadiums instance to it. Mockito will also remember that the call was
         * made.
         */
        final List<StadiumData> dto = stadiumFacade.getStadiums(IMAGE_FORMAT);
        // We now check that dto is a DTO version of stadiums..
        assertNotNull(dto);
        assertEquals(dto.size(), stadiums.size());
        assertEquals(dto.get(0).getName(), wembley.getCode());
        assertEquals(dto.get(0).getCapacity(), wembley.getCapacity().toString());
    }

    @Test
    public void testGetStadium()
    {
        /**
         * We instantiate an object that we would like to be returned to StadiumFacade when the mocked out
         * StadiumService's method getStadiums is called. This will be a list of two StadiumModels.
         */
        final StadiumModel wembley = new StadiumModel();
        wembley.setCode(STADIUM_NAME);
        wembley.setCapacity(STADIUM_CAPACITY);

        // We tell Mockito we expect StadiumService's method getStadiumForCode to be
        // called, and that when it is, wembley should be returned
        when(stadiumService.getStadiumForCode("wembley")).thenReturn(wembley);

        /**
         * We now make the call to StadiumFacade's getStadium. If within this method a call is made to StadiumService's
         * getStadium, Mockito will return the wembley instance to it. Mockito will also remember that the call was made.
         */
        final StadiumData stadium = stadiumFacade.getStadium("wembley", IMAGE_FORMAT);
        // Check that stadium is a correct DTO representation of the wembley ServiceModel
        assertEquals(stadium.getName(), wembley.getCode());
        assertEquals(stadium.getCapacity(), wembley.getCapacity().toString());
    }
}