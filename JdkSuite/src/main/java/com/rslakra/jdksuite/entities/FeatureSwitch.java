package com.rslakra.jdksuite.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * A feature switch that turns a feature on or off for an entity.
 *
 * <pre>
 * {
 *   "feature": "B2B::&lt;random-uuid&gt;::field_name",
 *   "entityType": "EntityType",
 *   "expiry": null,
 *   "status": "ON",
 *   "category": "CategoryType",
 *   "entityId": 0
 * }
 * </pre>
 *
 * @author Rohtash Lakra
 * @version 1.0.0
 * @since 11/14/2026 4:55 PM
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FeatureSwitch {

    /**
     * The feature name, for example <code>B2B::&lt;random-uuid&gt;::field_name</code>.
     */
    private String feature;

    /**
     * The type of the entity the feature applies to.
     */
    private String entityType;

    /**
     * The id of the entity the feature applies to.
     */
    private Long entityId;

    /**
     * The status of the switch, for example <code>ON</code>.
     */
    private String status;

    /**
     * The category of the feature.
     */
    private String category;

    /**
     * The expiry of the switch, <code>null</code> if it never expires.
     */
    private Date expiry;
}
