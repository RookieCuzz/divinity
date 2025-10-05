package studio.magemonkey.divinity.stats.tiers;

import org.bukkit.NamespacedKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import studio.magemonkey.codex.util.StringUT;
import studio.magemonkey.divinity.stats.items.ItemTags;

public class Tier {

    private String id;
    private String name;
    private String color;
    private String tooltip;
    private NamespacedKey tooltipStyle;

    public Tier(
            @NotNull String id,
            @NotNull String name,
            @NotNull String color,
            @NotNull String tooltip
    ) {
        this.id = id.toLowerCase();
        this.name = StringUT.color(name);
        this.color = StringUT.color(color);
        this.tooltip = StringUT.color(tooltip);
        this.name = this.format(this.name);
        this.tooltip = this.format(this.tooltip);
    }

    @NotNull
    public String getId() {
        return this.id;
    }

    @NotNull
    public String getName() {
        return this.name;
    }

    @NotNull
    public String getColor() {
        return this.color;
    }

    @NotNull
    public String getTooltip() {
        return this.tooltip;
    }

    @Nullable
    public NamespacedKey getTooltipStyle() {
        return this.tooltipStyle;
    }

    public void setTooltipStyle(@Nullable NamespacedKey tooltipStyle) {
        this.tooltipStyle = tooltipStyle;
    }

    @NotNull
    public String format(@NotNull String str) {
        return str
                .replace(ItemTags.PLACEHOLDER_TIER_COLOR, this.getColor())
                .replace(ItemTags.PLACEHOLDER_TIER_NAME, this.getName())
                .replace(ItemTags.PLACEHOLDER_TIER_TOOLTIP, this.getTooltip());
    }
}
