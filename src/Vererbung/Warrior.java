package Vererbung;

public class Warrior extends Character
{
    private float rage;
    private float requiredRage = 3;
    private int rageCounter;
    private int rageDuration = 3;
    
    public Warrior(String _name, float _hp, float _damage, float _defense, int _requiredRage, int _rageDuration)
    {
        super(_name, _hp, _damage, _defense);
        
        requiredRage = _requiredRage;
        rageDuration = _rageDuration;
        rageCounter = rageDuration;
    }
    
    public void Attack(Character character)
    {
        float dmg = super.damage;
        
        System.out.println(super.name + " haut mit einer Axt auf " + character.name);
        
        if (isEnraged())
        {
            rageCounter++;
            if (!isEnraged())
            {
                // Rage ist vorbei
                rage = 0;
            }
            
            dmg *= 1.5f;
            character.LowerDefense(1);
        }
        
        character.TakeDamage(dmg);
        
        rage++;
        if (rage >= requiredRage && !isEnraged())
        {
            System.out.println(super.name + " aktiviert Rage für " + rageDuration + " Züge");
            rageCounter = 0;
        }
    }
    
    boolean isEnraged()
    {
        return rageCounter < rageDuration;
    }
}