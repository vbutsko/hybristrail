package de.hybris.platform.cuppytrailfrontend;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.apache.log4j.Logger;

public class StadiumsNameEncoded
{
    private final static Logger LOG = Logger.getLogger(StadiumsNameEncoded.class);

    public static String getNameEncoded(final String name)
    {
        try
        {
            return URLEncoder.encode(name, "UTF-8");
        }
        catch (final UnsupportedEncodingException e)
        {
            LOG.error("Problems while encoding", e);
            return "";
        }
    }
}