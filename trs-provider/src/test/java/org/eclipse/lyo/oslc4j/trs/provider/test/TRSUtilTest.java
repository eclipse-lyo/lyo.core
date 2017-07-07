package org.eclipse.lyo.oslc4j.trs.provider.test;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;
import org.eclipse.lyo.core.trs.ChangeEvent;
import org.eclipse.lyo.core.trs.Creation;
import org.eclipse.lyo.core.trs.Modification;
import org.eclipse.lyo.oslc4j.trs.provider.HistoryData;
import org.eclipse.lyo.oslc4j.trs.provider.TRSUtil;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TRSUtilTest {
    static HistoryData hd;
    static ChangeEvent ce;
    static String uriPrefix = "https://host";
    static String ceUriPrefix = uriPrefix + "/changeEvents";
    static int changeEventNum = 0;
    static int baseMemberNum = 0;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {

        hd = HistoryData.getInstance(new Date(), new URI(baseMemberUri()), HistoryData.CREATED);
        ce = new Modification();
        initChangeEvent(ce);
        ce.getExtendedProperties().put(TRSUtil.dateModifiedQname, new Date());
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public final void testHistoryDataToChangeEvent() {
        ChangeEvent convertedCe = (ChangeEvent) TRSUtil.historyDataToChangeEvent(hd);
        HistoryData convertedHd = (HistoryData) TRSUtil.historyDataToChangeEvent(ce);

        Assert.assertTrue(convertedCe.getChanged().equals(hd.getUri()));
        Assert.assertTrue(convertedCe.getExtendedProperties()
                .get(TRSUtil.dateModifiedQname)
                .equals(hd.getTimestamp()));
        Assert.assertTrue(convertedCe instanceof Creation);

        Assert.assertTrue(ce.getChanged().equals(convertedHd.getUri()));
        Assert.assertTrue(ce.getExtendedProperties()
                .get(TRSUtil.dateModifiedQname)
                .equals(convertedHd.getTimestamp()));
        Assert.assertTrue(convertedHd.getType().equals(HistoryData.MODIFIED));

    }

    private static void initChangeEvent(ChangeEvent ce) throws URISyntaxException {
        java.net.URI changeEvenUri = new URI(changeEventUri());
        java.net.URI baseMemberUri = new URI(baseMemberUri());

        ce.setAbout(changeEvenUri);
        ce.setChanged(baseMemberUri);
        ce.setOrder(changeEventNum);

    }

    private static String changeEventUri() {
        return ceUriPrefix + "/" + changeEventNum++;
    }

    private static String baseMemberUri() {
        return ceUriPrefix + "/" + baseMemberNum++;
    }

}
