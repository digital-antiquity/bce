package org.dataarc.core.search.query;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class SearchQueryObject {

    private Spatial spatial = new Spatial();
    private Temporal temporal = new Temporal();
    private boolean idOnly = false;
    private boolean idAndMap = false;
    private Integer size;
    private Integer page;

    private List<String> keywords = new ArrayList<>();
    private List<Long> indicators = new ArrayList<>();
    private List<String> topicIds = new ArrayList<>();
    private List<String> sources = new ArrayList<>();
    private List<String> ids = new ArrayList<>();

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public List<String> getTopicIds() {
        return topicIds;
    }

    public void setTopicIds(List<String> topicIds) {
        this.topicIds = topicIds;
    }

    public List<String> getSources() {
        return sources;
    }

    public void setSources(List<String> source) {
        this.sources = source;
    }

    public boolean isIdOnly() {
        return idOnly;
    }

    public void setIdOnly(boolean idOnly) {
        this.idOnly = idOnly;
    }

    public Spatial getSpatial() {
        return spatial;
    }

    public void setSpatial(Spatial spatial) {
        this.spatial = spatial;
    }

    public Temporal getTemporal() {
        return temporal;
    }

    public void setTemporal(Temporal temporal) {
        this.temporal = temporal;
    }

    public boolean emptySpatial() {
        if (getSpatial() == null) {
            return true;
        }

        if (StringUtils.isNotBlank(getSpatial().getRegion())) {
            return false;
        }

        if (getSpatial().getBottomRight() == null ||
                getSpatial().getBottomRight().length < 2) {
            return true;
        }

        if (getSpatial().getTopLeft() == null ||
                getSpatial().getTopLeft().length < 2) {
            return true;
        }

        return false;
    }

    public boolean emptyTemporal() {
        if (getTemporal() == null) {
            return true;
        }
        if (getTemporal().getEnd() == getTemporal().getStart() && getTemporal().getStart() == null) {
            return true;
        }
        return false;
    }

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public boolean isIdAndMap() {
        return idAndMap;
    }

    public void setIdAndMap(boolean idAndMap) {
        this.idAndMap = idAndMap;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public List<Long> getIndicators() {
        return indicators;
    }

    public void setIndicators(List<Long> indicators) {
        this.indicators = indicators;
    }

}
