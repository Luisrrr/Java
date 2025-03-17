package Vererbung;

public class Mage extends Character
{
    public float mana;
    public float maxMana;
    public float manaCost;
    public String spellName;
    
    public Mage(String _name, float _hp, float _damage, float _defense, float _maxMana, float _manaCost, String _spellName)
    {
        super(_name, _hp, _damage, _defense);
        
        mana = _maxMana;
        manaCost = _manaCost;
        spellName = _spellName;
    }
    
    public void CastSpellAt(Character character)
    {
        if (mana < manaCost)
        {
            System.out.println(super.name + " hat nicht genug Mana für " + spellName + " (" + mana + "/" + manaCost + ")");
            return;
        }
        
        mana -= manaCost;
        
        System.out.println(super.name + " spricht " + spellName);
        
        character.TakeDamage(super.damage);
    }
}