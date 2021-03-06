/*
 *  Holographic Extension
 *  Copyright (C) 2015 - 2019 Niall7459
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package net.kitesoftware.holograms.animation.impl;

import net.kitesoftware.holograms.animation.ConfigurableAnimation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pause implements ConfigurableAnimation {

    private static final Map<String, String> DEFAULTS = new HashMap<String, String>() {{
        put("times", "10");
    }};

    @Override
    public String getName() {
        return "pause";
    }

    @Override
    public Map<String, String> getOptions() {
        return DEFAULTS;
    }

    @Override
    public List<String> create(String text, Map<String, String> options) {
        List<String> frames = new ArrayList<>();

        int pause = Integer.parseInt(options.get("times"));
        for (int i = 0; i < pause; i++) {
            frames.add(text);
        }

        return frames;
    }
}
