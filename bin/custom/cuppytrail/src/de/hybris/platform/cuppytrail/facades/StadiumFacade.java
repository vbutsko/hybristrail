package de.hybris.platform.cuppytrail.facades;

import de.hybris.platform.cuppytrail.data.StadiumData;

import java.util.List;

public interface StadiumFacade
{
    StadiumData getStadium(String name, String format);

    List<StadiumData> getStadiums(String format);
}