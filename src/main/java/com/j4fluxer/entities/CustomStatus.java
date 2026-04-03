package com.j4fluxer.entities;

import org.json.JSONObject;

import java.util.Optional;

// See https://docs.fluxer.app/gateway/events#customstatusresponse
public record CustomStatus(Optional<String> text, Optional<String> emojiId, Optional<String> emojiName, Optional<String> expiresAt) {
    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        text.ifPresent(s -> json.put("text", s));
        emojiName.ifPresent(s -> json.put("emoji_name", s));
        emojiId.ifPresent(s -> json.put("emoji_id", s));
        expiresAt.ifPresent(s -> json.put("expires_at", s));
        return json;
    }
}
