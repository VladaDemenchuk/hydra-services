package service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonLdDTO {

    @JsonProperty("@context")
    private String context;

    @JsonProperty("@id")
    private String id;

    @JsonProperty("@type")
    private String type;

    public JsonLdDTO(String context, String id, String type) {
        this.context = context;
        this.id = id;
        this.type = type;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
