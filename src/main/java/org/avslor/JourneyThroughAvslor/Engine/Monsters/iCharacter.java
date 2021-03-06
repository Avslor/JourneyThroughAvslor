package org.avslor.JourneyThroughAvslor.Engine.Monsters;

/*   Copyright 2013 James Loyd , Joshua Theze
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

/*
 * This interface is the contracted methods for every new charachter class.
 */
public interface iCharacter
{
    //What every character should have
    String getName();
    String getRace();
    String getAlignment();
    String getClassName();
    String getHealthPoints();
    String getMagicPoints();
    int getLevel();
}
